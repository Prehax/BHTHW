public class MVC {
}


/user/1/load ? minAge=20
/user/login

>HEADER: timeStamp: 1/1/32335
>Body:
>username:
>password:
//专门用来表示这个类是做REST处理的
@Controller
//在一开始加上这个路径 /user
@RequestMapping(value = "/user")


public class UserController {

    //拿到数据
    @RequestMapping(value = "/{userId}/load?minAge=20" method = RequestMethod.GET)
    public User getUser(@PathVariable("userId") int id,
                        @RequestParam("minAge") @DefaultValue("20") int minAge) {
        UserService service = new UserCService();
        return service.getUser(id, minAge);
    }

    //凡是通过箱子传的数据， 通通用POST， 因为GET只能通过URL传
    @RequestMapping(value="/login", method = RequestMethod.POST)
    // 可以被替换为GetMapping, PutMapping, PostMapping, DeleteMapping
    public User login(@RequestHeader("timestamp") TimeStamp time,
                      @RequestBody LoginUser loginUser) {
        return service.getLoginUser(name, password);
    }

    //添加user
    /user/add{name:'', address:''}
    @RequestMapping(value="/add", method=RequestMethod.POST)
    public void addUser(@RequestBody User u) {
        service.addNewUser(u);
    }
}

/product/100
/product/all
@Controller
@RequestMapping(value = "/product")
public class ProductController {

}