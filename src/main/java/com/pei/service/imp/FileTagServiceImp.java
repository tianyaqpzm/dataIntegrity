package com.pei.service.imp;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.pei.pojo.Filetag;
import com.pei.utils.db.DBOperation;

import it.unisa.dia.gas.jpbc.Element;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by pei on 2017/8/19.
 */
@SuppressWarnings("SpringJavaAutowiringInspection")
@Service
public class FileTagServiceImp implements com.pei.service.IFileTagService {

    @Resource
    private com.pei.mapper.FiletagMapper filetagMapper;
    @Override
    public void insertTag(Element[] tag) {


//        //创建查询条件
//        FiletagExample example = new FiletagExample();
//        FiletagExample.Criteria criteria = example.createCriteria();
//        criteria.andNameIsNotNull();
//        filetagMapper.deleteByExample(example);
        DBOperation.clear("filetag");

        for(int i=0;i<tag.length;i++) {
//            // 将每一个tag[i] 计算hash
            byte[] temp = tag[i].toBytes();
//            hashutil.getSHA2Hex(temp);
            Filetag record = new Filetag(" "+String.valueOf(i + 1),"",temp);
            int result = filetagMapper.insert(record);
        }

    }
}
