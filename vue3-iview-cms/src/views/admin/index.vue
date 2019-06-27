<template>
    <div class="layout">
      <Layout>
        <c-head></c-head>
        <Content :style="{margin: '88px 20px 0', background: '#fff', minHeight: '500px'}">
            <router-view></router-view>
        </Content>
        <c-foot></c-foot>
      </Layout>
    </div>
</template>
<script>
import Head from "@/components/admin/c-head";
import Foot from "@/components/admin/c-foot";

export default {
    name: "home",
    components: {
        "c-head": Head,
        "c-foot": Foot
    }
}
</script>

