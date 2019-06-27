import Vue from "vue";
import Router from "vue-router";
import AdminHome from "./views/admin/content/v-home.vue";
import AdminContent from "./views/admin/content/v-content.vue";
import AdminTable from "./views/admin/content/v-table.vue";

Vue.use(Router);

export default new Router({
  mode: "history",
  base: process.env.BASE_URL,
  routes: [
    {
      path: "/",
      name: "v-a-home",
      component: AdminHome
    },
    {
      path: "/admin/home",
      name: "v-a-home",
      component: AdminHome
    },
    {
      path: "/admin/table",
      name: "v-a-table",
      component: AdminTable
    },
    {
      path: "/admin/content",
      name: "v-a-content",
      component: AdminContent
      // route level code-splitting
      // this generates a separate chunk (about.[hash].js) for this route
      // which is lazy-loaded when the route is visited.
      // component: () =>
      //   import(/* webpackChunkName: "about" */ "./views/admin/login/v-login.vue")
    }
  ]
});
