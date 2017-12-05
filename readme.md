1.导入thymeleaf的依赖包.
2.web项目首先application类先继承WebMvcConfigurerAdapter
3.注意:跳转到静态页面,不可以直接跳转,必须经过controller层,除非放在static中.
4.th:field=*{属性},相当于name={属性},
5.th:value=${属性},相当于value={属性值},
6.单选框按钮回写时,thymeleaf会自动选择,不需要使用三目判断,不需要th:value=${属性},直接写name=***就可以自动判断.
