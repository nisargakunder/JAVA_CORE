package com.peaks;

import com.peaks.dto.Ascents;
import com.peaks.dto.FirstAscend;
import com.peaks.dto.Mountains;
import com.peaks.dto.repo.PeaksRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;

@SpringBootApplication
public class PeaksApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PeaksApplication.class, args);
	}

	@Autowired
	private PeaksRepo peaksRepo;

	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public void run(String... args) throws Exception {
//		peaksRepo.save(new Mountains("Everest", 8848, List.of("Nepal", "China"),
//				new Ascents(new FirstAscend(1953), new FirstAscend(1980), 5656)));
//		peaksRepo.save(new Mountains("K2", 8611, List.of("Pakistan", "China"),
//				new Ascents(new FirstAscend(1954), new FirstAscend(1921), 306)));
//		peaksRepo.save(new Mountains("Kangchenjunga", 8586, List.of("Nepal", "India"),
//				new Ascents(new FirstAscend(1955), new FirstAscend(1986), 283)));
//		peaksRepo.save(new Mountains("Lhotse", 8516, List.of("Nepal", "China"),
//				new Ascents(new FirstAscend(1956), new FirstAscend(1988), 461)));
//		peaksRepo.save(new Mountains("Makalu", 8485, List.of("China", "Nepal"),
//				new Ascents(new FirstAscend(1955), new FirstAscend(2009), 361)));
//

		List<Mountains> mountains = peaksRepo.findByNameEverestAndHeight8848();
		System.out.println(mountains);

		List<Mountains> mountains1 = peaksRepo.findByLocationChinaAndNepal();
		System.out.println(mountains1);

		List<Mountains> mountains2 = peaksRepo.findAllExcludingAscentsAndLocation();
		System.out.println(mountains2);

		List<Mountains> mountains3 = peaksRepo.findByFirstWinterAscendedAfter2000();
		System.out.println(mountains3);

		List<Mountains> topMountains = findTopThreeMountains();
		System.out.println(topMountains);
	}

	// Method to find top 3 mountains
	public List<Mountains> findTopThreeMountains() {
		Query query = new Query();
		query.limit(3);
		return mongoTemplate.find(query, Mountains.class);
	}
}
