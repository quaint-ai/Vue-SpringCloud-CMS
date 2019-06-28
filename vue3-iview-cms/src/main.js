import Vue from "vue";
import App from "./App.vue";
import axios from "axios";
import router from "./router/index";
import store from "./store/store";
import "./plugins/iview.js";

Vue.config.productionTip = false;
Vue.prototype.$axios = axios;
axios.defaults.withCredentials =true;


new Vue({
  router,
  store,
  render: h => h(App)
}).$mount("#app");
