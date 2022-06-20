Vue.component("sports-facilities", { 
	data: function () {
	    return {
	      facilities: null
	    }
	},
	    template: ` 
    	<div>
    		<h3>Prikaz sportskih objekata</h3>
            <button v-on:click = "login">Login</button>
            <button v-on:click = "register">Register</button>
            <button v-on:click = "search">Search</button>
    		<table border="1">
	    		<tr bgcolor="lightgrey">
	    			<th>Ime</th>
	    			<th>Tip</th>
                    <th>Lokacija</th>
                    <th>Prosečna ocena</th>
                    <th>Radno vreme</th>
	    			<th>Logo</th>
	    		</tr>
	    			
	    		<tr v-for="(f, index) in facilities">
	    			<td>{{f.name}}</td>
	    			<td>{{f.type}}</td>
                    <td>{{f.location}}</td>
                    <td>{{f.averageRating}}</td>
                    <td>{{f.workingHours}}</td>
	    			<td><img v-bind:src="f.logo"/></td>
	    		</tr>
	    	</table>
    	</div>		  
    	`,
    mounted () {
        axios
          .get('rest/facilities/')
          .then(response => (this.facilities = response.data))
    },
    methods: {
    	login : function() {
    		router.push(`/login`);
    	},
        register : function() {
    		router.push(`/register`);
    	},
    	search : function() {
            router.push(`/searchfacilities`);
    	}
    }
});