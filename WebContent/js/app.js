//import 'bootstrap/dist/css/bootstrap.min.css'

const Login = { template: '<login></login>' }
const Register = { template: '<register></register>' }
const SportsFacilities = { template: '<sports-facilities></sports-facilities>' }
//const SearchFacilities = { template: '<search-facilities></search-facilities>' }

const router = new VueRouter({
	mode: 'hash',
	  routes: [
		{ path: '/', name: 'home', component: SportsFacilities},
		{ path: '/login', name: 'login', component: Login},
		{ path: '/register', name: 'register', component: Register},
		//{ path: '/searchfacilities', name: 'searchFacilities', component: SearchFacilities}
	  ]
});

var app = new Vue({
	router,
	el: '#facilities'
});