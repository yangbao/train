import { createRouter, createWebHistory } from 'vue-router'

const routes = [
  {
    path: '/',
    name: 'home',
    component: () => import('../views/Main.vue')
  },
  {
    path: '/login',
    component: () => import('../views/LoginView.vue')

  }
]

const router = createRouter({
  // 去掉`#`号
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
