package com.kun.broccoli.controller;

import com.kun.broccoli.entity.User;
import com.kun.broccoli.mapper.UserMapper;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//下面两个注解意思是给前端ajax链接的地址。必须写的。@RequestMapping("/HistoryRecord")这个小括号内的就是地址，前端访问的后台接口路由
@RestController
@RequestMapping("/User")
public class UserController {
    //下面的注解：从spring容器中把userMapper引入进来，相当于前端把组件js引入后可以直接使用组件内的方法，这里是吧后端链接数据库的接口引入进来，这样可以直接调用数据库的方法找数据返回给前端用
    @Resource
    UserMapper UserMapper;
    //下面的注解CrossOrigin:意思是解决前端请求跨域问题，当然这种只能解决一个接口，如果你下面再写一个get接口还是要再复制一遍，也可以自行网上找配置跨域的全局写法一次解决所有。

    @CrossOrigin(origins ="*",maxAge = 3600)
    //注解GetMapping:意思是这是一个get请求接口，前端要用get请求不能post之类的。然后get的接口地址是select。配合上面的一级地址合起来就是，/HistoryRecord/select。
    // 后端会给你这个地址就代表这个接口地址，配合基础地址完整的接口地址是比如http://localhost:8080/HistoryRecord/select，这个前端应该能看得懂吧。
    @GetMapping("/getAllUser")
    //这个下面的方法解释：
    // List：代表数组对象。
    // <User>：代表你的数据库的实体类，也就是你创建的entity文件夹下的HistoryRecord文件。映射你的数据库字段的。这里不能写错，写错了就对应不上了。返回的数据就不成功或者字段不对或者全是null的情况
    //findAllUser()：这就是个方法名没啥好说的
    public List<User> findAllUser(){
        //这里是返回给前端的数据：返回的是调用HistoryRecordMapper文件内的方法HistoryRecordAll。
        //前端角度解释：这里就是我们调用一个引入的js文件内的一个方法，那个方法也有return。所以我们调用方法（）这样后可以拿到return出来的值。
        // 而那个return的值就是后端查询了数据库后返回给后端的数据，然后这个前端接口内再把返回给前端。
        return UserMapper.UserAll();

    }

    @CrossOrigin(origins ="*",maxAge = 3600)
    @GetMapping("/getUser")
    public List<User> findUser(String name){
        return UserMapper.User(name);
    }

    @CrossOrigin(origins ="*",maxAge = 3600)
    @GetMapping("/insertUser")
    public void insertUser(String name,String password) {
        UserMapper.InsertUser(name,password);
    }

}
