<template>
  <div id="app">
    <div class="layout">
      <Layout>
        <c-head></c-head>
        <router-view></router-view>
        <c-foot></c-foot>
      </Layout>
    </div>
  </div>
</template>

<script>
import Head from "./components/admin/c-head";
import Foot from "./components/admin/c-foot";

export default {
  name: "app",
  components: {
    "c-head": Head,
    "c-foot": Foot
  }
};
</script>

<style>
#app {
  font-family: "Avenir", Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}
</style>
