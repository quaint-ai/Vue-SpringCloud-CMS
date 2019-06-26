import Vue from "vue";
import Router from "vue-router";
import Index from "./views/v-index.vue";

Vue.use(Router);

export default new Router({
  mode: "history",
  base: process.env.BASE_URL,
  routes: [
    {
      path: "/",
      name: "v-index",
      component: Index
    },
    {
      path: "/index",
      name: "v-index",
      // route level code-splitting
      // this generates a separate chunk (about.[hash].js) for this route
      // which is lazy-loaded when the route is visited.
      component: () =>
        import(/* webpackChunkName: "about" */ "./views/v-index.vue")
    }
  ]
});
