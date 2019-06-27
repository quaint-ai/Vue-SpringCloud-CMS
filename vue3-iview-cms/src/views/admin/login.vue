<style>

  .login{
    margin: 150px auto 0px auto;
    background-color: bisque;
    border-radius: 30px;
    width: 350px;
    height: 400px;
    padding: 50px
  }

</style>

<template>
  <div class="login">
    <p>后台登录界面，点击登录即可</p>
    <br/><br/><br/>
    <c-head-img></c-head-img>
    <br/><br/><br/>
    <router-link to="/admin">Login</router-link>
  </div>
</template>

<script>
import HeadImg from "@/components/public/c-head-img";

export default {
  components: {
    "c-head-img": HeadImg
  }
}
</script>

