<template>
    <div class="layout">
      <Layout>
        <c-head></c-head>
        <Content :style="{margin: '88px 20px 0', background: '#fff', minHeight: '500px'}">
            <h2>这里是前台展示页面</h2>
            <c-head-img></c-head-img>
        </Content>
        <c-foot></c-foot>
      </Layout>
    </div>
</template>
<script>
import Head from "@/components/cms/cms-head";
import Foot from "@/components/cms/cms-foot";
import HeadImg from "@/components/public/c-head-img";

export default {
    name: "home",
    components: {
        "c-head": Head,
        "c-foot": Foot,
        "c-head-img": HeadImg
    }
}
</script>

