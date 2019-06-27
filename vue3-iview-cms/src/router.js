import Vue from "vue";
import Router from "vue-router";
// 前台首页
import cmsIndex from "@/views/cms/cms-index.vue"
// 后台登录与退出 切换
import AdminLogin from "@/views/admin/login.vue";
import AdminIndex from "@/views/admin/index.vue";
// 下面为index下的子页面
import AdminHome from "./views/admin/pages/home.vue";
import AdminContent from "./views/admin/pages/content.vue";
import AdminTable from "./views/admin/pages/table.vue";

Vue.use(Router);

export default new Router({
  mode: "history",
  base: process.env.BASE_URL,
  routes: [
    {
      path: "/",
      component: cmsIndex
    },{
      path: "/admin-login",
      component: AdminLogin
    },{
      path: "/admin",
      component: AdminIndex,
      children: [
        {
          path: "/",
          component: AdminHome
        },
        {
          path: "home",
          component: AdminHome
        },
        {
          path: "table",
          component: AdminTable
        },
        {
          path: "content",
          component: AdminContent
        }
      ]
    }
  
    
  ]
});
