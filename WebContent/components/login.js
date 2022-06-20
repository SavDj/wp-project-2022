Vue.component("login", { 
	data: function () {
	    return {
            user: {username:null, password:null, firstName:null, lastName:null, gender:null, dateOfBirth:null, role:3, trainingHistory:null, membership:null, managedFacility:null, visitedFacilities:null, points:0, customerType:null}
	    }
	},
	    template: ` 
    	<div>
        <form id="forma">
		<table>
			<tr><td>Korisničko ime</td><td><input type="text" v-model = "user.username" name="username"></td></tr>
			<tr><td>Lozinka</td><td><input type="password" v-model = "user.password" name="password"></td></tr>
            <td><input type="login" v-on:click = "login">Login</button></td>
		</table>
	</form>
    	</div>
    	`,
    methods: {
    	login : function() {
            axios
            .post('rest/login/', user)
            .then(response => (router.push(`/`)))
        }
    }
});