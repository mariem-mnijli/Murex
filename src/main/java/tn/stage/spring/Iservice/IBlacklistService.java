package tn.stage.spring.Iservice;

import java.util.List;

import tn.stage.spring.entity.Blacklist;


	public interface IBlacklistService {
		public void addUserToBlacklist(String email);
		public void deleteUserFromBlacklist(Long id);
		public List<Blacklist> getAllBlacklist();

	}

