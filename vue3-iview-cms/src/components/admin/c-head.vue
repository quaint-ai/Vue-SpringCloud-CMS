<style scoped>
    .layout{
        border: 1px solid #d7dde4;
        background: #f5f7f9;
        position: relative;
        border-radius: 4px;
        overflow: hidden;
    }
    .layout-logo{
        width: 100px;
        height: 30px;
        background: #5b6270;
        border-radius: 3px;
        float: left;
        position: relative;
        top: 15px;
        left: 20px;
    }
    .layout-nav{
        width: 420px;
        margin: 0 auto;
        margin-right: 20px;
    }
    .layout-footer-center{
        text-align: center;
    }
</style>

<template>
    <Header :style="{position: 'fixed', width: '100%'}">
        <Menu mode="horizontal" theme="dark" active-name="1">
            <div class="layout-logo"><Avatar src="https://i.loli.net/2017/08/21/599a521472424.jpg" /></div>
            <div class="layout-nav">
                <MenuItem name="2">
                    <Icon type="ios-keypad"></Icon>
                    <router-link to="/">GoCMS</router-link>
                </MenuItem>
                <MenuItem name="3">
                    <Icon type="ios-analytics"></Icon>
                    <router-link to="/admin-login">Logout</router-link>
                </MenuItem>
            </div>
        </Menu>
    </Header>
</template>

