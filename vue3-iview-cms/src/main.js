import Vue from "vue";
import App from "./App.vue";
import router from "./router";
import store from "./store";
import "./plugins/iview.js";

Vue.config.productionTip = false;

// Vue.prototype.showHard = {val: false}
// Vue.prototype.showFoot = {val: false}
// Vue.prototype.loginHardFoot = function(){
//   this.showHard.val=true;
//   this.showFoot.val=true;
// }
// Vue.prototype.exitHardFoot = function(){
//   this.showHard.val=false;
//   this.showFoot.val=false;
// }


new Vue({
  router,
  store,
  render: h => h(App)
}).$mount("#app");
