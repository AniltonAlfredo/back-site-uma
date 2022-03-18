package com.site.uma.banner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class BannerService {
    private final BannerRepository bannerRepository;

    @Autowired
    public BannerService(BannerRepository bannerRepository) {
        this.bannerRepository = bannerRepository;
    }

    public BannerModel addBanner(BannerModel banner){
        return bannerRepository.save(banner);
    }
    public BannerModel updateBanner(BannerModel banner){
        return bannerRepository.save(banner);
    }
    public void deleteBanner(@RequestBody BannerModel banner){
        bannerRepository.delete(banner);
    }
    public List<BannerModel> listBanner(){
        return bannerRepository.findAll();
    }


}
