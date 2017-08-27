package com.pei.service.imp;



import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pei.mapper.FiletagMapper;
import com.pei.service.MerkleService;
import com.pei.utils.db.DBOperation;
import com.pei.utils.publicVerification.MerkleTree;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by pei on 2017/8/21.
 */
@SuppressWarnings("SpringJavaAutowiringInspection")

@Service
public class MerkleServiceImp implements MerkleService{

    @Resource
    private FiletagMapper filetagMapper;

    @Override
    public String computeRoot() {
        MerkleTree merkleTree = null;
        merkleTree = new MerkleTree(readTags());

        merkleTree.merkle_tree();
        String root = merkleTree.getRoot();
        System.out.println("Mrekle root:"+root);
        return root;
    }

    public  Map<String,byte[]> readTags(){

//        Filetag filetag = filetagMapper.selectAll();

        DBOperation dbo=new DBOperation();
        Map<String,byte[]> results=dbo.selectBatch("filetag");
        return results;
    }



}
