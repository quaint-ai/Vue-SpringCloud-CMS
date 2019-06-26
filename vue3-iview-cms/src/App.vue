<template>
  <div id="app">
    <index-layout></index-layout>
  </div>
</template>

<script>
import Index from "./views/v-index.vue";

export default {
  name: "app",
  components: {
    "index-layout": Index
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
