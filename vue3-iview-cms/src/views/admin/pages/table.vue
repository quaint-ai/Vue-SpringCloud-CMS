<template>
    <div>
        <Table stripe :columns="colName" :data="testUserData"></Table>
        <router-link to="/admin/home">Look Home</router-link>
    </div>
</template>
<script>
import {testUser} from '@/api/index'
    export default {
        name: 'shopStaff',
        data() {
            return {
                colName: [
                    {
                    title: 'Name',
                    key: 'userName'
                    },
                    {
                        title: 'Email',
                        key: 'userEmail'
                    },
                    {
                        title: 'Address',
                        key: 'userAddress'
                    }
                ],
                // staffData: [],
                testUserData: [],
                cur_page: 1,
                pagesize: 10,
                total: 0,
                loading: true
            }
        },
        mounted() {
            // this._resStaff();
            this._testUser();
        },
        methods: {
            _testUser(){
                testUser({
                    // 这里用来传请求参数  eg：
                    // "id": 1
                    // "id": this.$route.query.id
                }).then((res) => {
                    //成功响应会进入到这里，res为返回的响应内容
                    console.log(res.data);
                    // Table 必须要返回一个数组  由于调用的是查询id接口，这里处理成数组
                    this.testUserData = [res.data,res.data,res.data,res.data]
                }).catch((err) => {
                    console.error(err);
                    this.$message.error("请求失败");
                })
            }
            // _resStaff() {
            //     resStaff({
            //         // "resId": this.$route.query.resId
            //     }).then((res) => {
            //         console.log(res.data);
            //         if(res.data.code=="201") {
            //             this.loading = false;
            //             this.staffData = res.data.body;
            //             this.total = res.data.totalCount;
            //         } else {
            //             this.$message.error(`请求失败`);
            //         }
            //     }).catch((err) => {
            //         console.error(err);
            //         this.$message.error(`请求失败`);
            //     })
            // }
        }
    }
</script>
