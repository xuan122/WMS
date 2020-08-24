package org.example.service;

import com.alibaba.fastjson.JSON;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.example.mapper.WmsUserMapper;
import org.example.pojo.WmsUser;
import org.example.vo.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import springfox.documentation.spring.web.json.Json;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import java.util.List;
import java.util.concurrent.TimeUnit;


@Service
public class WmsUserService {
    @Resource
    private WmsUserMapper wmsUserMapper;

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    public WmsUser loginWmsUser(String wmsName,String password){
        WmsUser wmsUser =  wmsUserMapper.loginWmsUser(wmsName,password);
        String userJoin = JSON.toJSONString(wmsUser);
        //stringRedisTemplate.opsForValue().set("user" + "/" + uuid, userJoin, 3, TimeUnit.DAYS);
        return wmsUser;
    }

    public List<WmsUser> showWms(String wmsName,String job,int deptId,int roleId,int page,int pageSize) {
        return wmsUserMapper.showWms(wmsName,job,deptId,roleId,page,pageSize);
    }

    public int updateWmsPassword(int id,String password) {
        return wmsUserMapper.updateWmsPassword(id,password);
    }

    public int addWms(WmsUser wmsUser){
        return wmsUserMapper.addWms(wmsUser);
    }

    public int updateLoginTime(int id){
        return wmsUserMapper.updateLoginTime(id);
    }

    public int updateWmsUser(WmsUser wmsUser) {
        return wmsUserMapper.updateWmsUser(wmsUser);
    }

    public WmsUser getWmsUser(int id){
        return wmsUserMapper.getWmsUser(id);
    }

    public int deleteWms(int id){
        return wmsUserMapper.deleteWms(id);
    }

}
