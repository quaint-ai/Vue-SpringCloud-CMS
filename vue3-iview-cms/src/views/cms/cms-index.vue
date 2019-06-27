<template>
    <div class="layout">
      <Layout>
        <cms-head></cms-head>
        <!-- 面包屑 -->
        <cms-crumb></cms-crumb>
        <Content :style="{margin: '88px 20px 0', background: '#fff', minHeight: '500px'}">
            <h2>这里是前台展示页面</h2>
            <Layout>
              <!-- 内容 -->
              <Content>
                <cms-rotation></cms-rotation>
              </Content>
              <!-- 右侧 -->
              <Sider>
                <c-head-img></c-head-img>
              </Sider>
            </Layout>
        </Content>
        <cms-foot></cms-foot>
      </Layout>
    </div>
</template>
<script>
import Head from "@/components/cms/cms-head";
import Foot from "@/components/cms/cms-foot";
import Rotation from "@/components/cms/cms-rotation";
import Crumb from "@/components/cms/cms-crumb";

import HeadImg from "@/components/public/c-head-img";

export default {
    name: "home",
    components: {
        "cms-head": Head,
        "cms-foot": Foot,
        "cms-rotation": Rotation,
        "cms-crumb": Crumb,
        "c-head-img": HeadImg
    }
}
</script>

