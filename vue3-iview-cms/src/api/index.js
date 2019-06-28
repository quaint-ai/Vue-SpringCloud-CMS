import axios from "axios"

const webtest = 'http://localhost:80';

const axiosInstance = axios.create({
    headers: {'Content-Type': 'application/json;charset=utf-8'},// 设置传输内容的类型和编码
    withCredentials: true // 指定某个请求应该发送凭据。允许客户端携带跨域cookie，也需要此配置
  });
// 查询样例用户列表 用于测试
export const testUser = (params) => {
    return axiosInstance({
        url: webtest + "/api/user/1",
        method: "get",
        data: params
    })
}

// const website = 'http://localhost:8885';

// 查询餐厅员工列表 请求公司的就够测试
// export const resStaff = (params) => {
//     return axios({
//         url: website + "/admin/res/staff/",
//         method: "post",
//         data: params
//     })
// }