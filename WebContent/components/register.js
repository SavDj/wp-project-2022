Vue.component("register", { 
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
            <tr><td>Ime</td><td><input type="text", v-model = "user.firstName" name="firstName"></td></tr>
			<tr><td>Prezime</td><td><input type="text" v-model = "user.lastName" name="lastName"></td></tr>
            <tr><td>Pol</td><td>
                <select v-model = "user.gender" name="gender" id="gender">
                    <option value="male">Male</option>
                    <option value="female">Female</option>
                </select>
            </td></tr>
            <tr><td>Datum rođenja</td><td><input type="date" v-model = "user.dateOfBirth" name="dateOfBirth"></td>
			<td><input type="submit" v-on:click = "register">Register</button></td>
		</table>
	</form>
    	</div>
    	`,
    methods: {
    	register : function() {
            axios
            .post('rest/register/', user)
            .then(response => (router.push(`/`)))
    	}
	}
});