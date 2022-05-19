package com.blq.fr.gestionDesOffresBackend.cache;

import java.util.concurrent.TimeUnit;

import org.springframework.cache.CacheManager;
import org.springframework.cache.caffeine.CaffeineCacheManager;
import org.springframework.context.annotation.Configuration;

import com.github.benmanes.caffeine.cache.Caffeine;

@Configuration
public class CaffeineCacheConfig {

		public CacheManager cacheManager() {
			
			// Manage les caches
			CaffeineCacheManager cacheManager = new CaffeineCacheManager("partenaire", "offre");
			cacheManager.setCaffeine(caffeineCacheBuilder());
			
			return cacheManager;
			
		}
		
		Caffeine<Object, Object> caffeineCacheBuilder() {
			return Caffeine.newBuilder()
					.initialCapacity(100)
					.maximumSize(500)
					.expireAfterAccess(10, TimeUnit.MINUTES)
					.recordStats();
					
		}
}


