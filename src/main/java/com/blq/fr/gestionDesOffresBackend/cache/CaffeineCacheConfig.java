package com.blq.fr.gestionDesOffresBackend.cache;

import static com.blq.fr.gestionDesOffresBackend.GestionDesOffresBackendApplication.OFFRES_VIEW;
import static com.blq.fr.gestionDesOffresBackend.GestionDesOffresBackendApplication.PARTENAIRES_VIEW;

import java.util.concurrent.TimeUnit;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.caffeine.CaffeineCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.github.benmanes.caffeine.cache.Caffeine;

//Mise en cache
@EnableCaching
@Configuration
@ComponentScan(basePackages = "com.blq.fr.gestionDesOffresBackend")
public class CaffeineCacheConfig {

		@Bean
		public CacheManager cacheManager() {
			
			// Manage les caches
			CaffeineCacheManager cacheManager = new CaffeineCacheManager(PARTENAIRES_VIEW, OFFRES_VIEW);
			cacheManager.setCaffeine(caffeineCacheBuilder());
			
			return cacheManager;
			
//			return new EhCacheCacheManager(ehCacheCacheManager().getObject());
			
		}
		
		Caffeine<Object, Object> caffeineCacheBuilder() {
			return Caffeine.newBuilder()
					.initialCapacity(100)
					.maximumSize(500)
					.expireAfterAccess(10, TimeUnit.MINUTES)
					.recordStats();
					
		}
		
//		@Bean
//		public EhCacheManagerFactoryBean ehCacheCacheManager() {
//			
//			EhCacheManagerFactoryBean factory = new EhCacheManagerFactoryBean();
//			factory.setConfigLocation(new ClassPathResource("ehcache.xml"));
//			factory.setShared(true);
//			return factory;
//			
//		}
		
}


