

// Added by the Spring Security Core plugin:
grails.plugin.springsecurity.userLookup.userDomainClassName = 'cs4760progassign.User'
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'cs4760progassign.UserRole'
grails.plugin.springsecurity.authority.className = 'cs4760progassign.Role'
grails.plugin.springsecurity.controllerAnnotations.staticRules = [
	[pattern: '/',               access: ['permitAll']],
	[pattern: '/error',          access: ['permitAll']],
	[pattern: '/index',          access: ['permitAll']],
	[pattern: '/index.gsp',      access: ['permitAll']],
	[pattern: '/shutdown',       access: ['permitAll']],
	[pattern: '/assets/**',      access: ['permitAll']],
	[pattern: '/**/js/**',       access: ['permitAll']],
	[pattern: '/**/css/**',      access: ['permitAll']],
	[pattern: '/**/images/**',   access: ['permitAll']],
	[pattern: '/**/favicon.ico', access: ['permitAll']],
	[pattern: '/dbconsole',      access: ['ROLE_ADMIN']],

	// Added 3.3
	[pattern: '/books/**',       access: ['permitAll']],
	[pattern: '/book/**',       access: ['permitAll']],
	[pattern: '/authors/**',     access: ['permitAll']],

	[pattern: '/controllerList/**', access: ['ROLE_ADMIN']],
	[pattern: '/author/**',         access: ['ROLE_ADMIN']],

	// Added 3.4
	[pattern: '/user/**',             access: ['ROLE_ADMIN']],
	[pattern: '/role/**',             access: ['ROLE_ADMIN']],
	[pattern: '/registrationCode/**', access: ['ROLE_ADMIN']],
	[pattern: '/securityInfo/**',     access: ['ROLE_ADMIN']],
	[pattern: '/logout/**',           access: ['permitAll']],

	// Added 3.7
	[pattern: '/home/**',              access: ['permitAll']],

]

grails.plugin.springsecurity.filterChain.chainMap = [
	[pattern: '/assets/**',      filters: 'none'],
	[pattern: '/**/js/**',       filters: 'none'],
	[pattern: '/**/css/**',      filters: 'none'],
	[pattern: '/**/images/**',   filters: 'none'],
	[pattern: '/**/favicon.ico', filters: 'none'],
	[pattern: '/**',             filters: 'JOINED_FILTERS']
]

grails.plugin.springsecurity.logout.postOnly = false

// Added by the Spring Security Core plugin:
grails.plugin.springsecurity.userLookup.userDomainClassName = 'prog1.User'
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'prog1.UserRole'
grails.plugin.springsecurity.authority.className = 'prog1.Role'
grails.plugin.springsecurity.controllerAnnotations.staticRules = [
	[pattern: '/',               access: ['permitAll']],
	[pattern: '/error',          access: ['permitAll']],
	[pattern: '/index',          access: ['permitAll']],
	[pattern: '/index.gsp',      access: ['permitAll']],
	[pattern: '/shutdown',       access: ['permitAll']],
	[pattern: '/assets/**',      access: ['permitAll']],
	[pattern: '/**/js/**',       access: ['permitAll']],
	[pattern: '/**/css/**',      access: ['permitAll']],
	[pattern: '/**/images/**',   access: ['permitAll']],
	[pattern: '/**/favicon.ico', access: ['permitAll']],
	[pattern: '/dbconsole',      access: ['ROLE_ADMIN']],

	// Added 3.3
	[pattern: '/books/**',       access: ['permitAll']],
	[pattern: '/book/**',       access: ['permitAll']],
	[pattern: '/authors/**',     access: ['permitAll']],

	[pattern: '/controllerList/**', access: ['ROLE_ADMIN']],
	[pattern: '/author/**',         access: ['ROLE_ADMIN']],

	// Added 3.4
	[pattern: '/user/**',             access: ['ROLE_ADMIN']],
	[pattern: '/role/**',             access: ['ROLE_ADMIN']],
	[pattern: '/registrationCode/**', access: ['ROLE_ADMIN']],
	[pattern: '/securityInfo/**',     access: ['ROLE_ADMIN']],
	[pattern: '/logout/**',           access: ['permitAll']],

	// Added 3.7
	[pattern: '/home/**',              access: ['permitAll']],

]

grails.plugin.springsecurity.filterChain.chainMap = [
	[pattern: '/assets/**',      filters: 'none'],
	[pattern: '/**/js/**',       filters: 'none'],
	[pattern: '/**/css/**',      filters: 'none'],
	[pattern: '/**/images/**',   filters: 'none'],
	[pattern: '/**/favicon.ico', filters: 'none'],
	[pattern: '/**',             filters: 'JOINED_FILTERS']
]

