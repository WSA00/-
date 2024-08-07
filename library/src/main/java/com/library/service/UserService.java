package com.library.service;

import com.library.pojo.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.library.response.ChangePassword;
import com.library.utils.Result;
import com.qiniu.api.auth.AuthException;
import jakarta.servlet.http.HttpServletRequest;
import org.apache.ibatis.annotations.Param;
import org.json.JSONException;

/**
* @description 针对表【user】的数据库操作Service
*/
public interface UserService extends IService<User> {


    Result register(User user);

    Result login(User user);

    Result AutoLogin(HttpServletRequest request);

    Result userPageSelect(Integer page, Integer pageSize);

    Result selectUserById(Integer id);

    Result updateUserById(Integer id, User user);

    Result updateAvatar(Integer id,String avatar);

    Result deleteUser(Integer id);

    Result checkPhone(@Param("phone") String phone);

    Result getAllUser();

    Result updatePassword(Integer id, ChangePassword changePassword);

    Result userHistory(Integer id);

    Result userUpload() throws AuthException, JSONException;
}
