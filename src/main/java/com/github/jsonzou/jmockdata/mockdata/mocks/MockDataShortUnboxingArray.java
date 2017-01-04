/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.github.jsonzou.jmockdata.mockdata.mocks;

import com.github.jsonzou.jmockdata.mockdata.JMockDataManager;
import com.github.jsonzou.jmockdata.mockdata.JmockDataContext;
import com.github.jsonzou.jmockdata.mockdata.MockData;
import com.github.jsonzou.jmockdata.mockdata.constants.MockType;

/**
 *  mock the Short data
 * Created by v_zoupengfei on 2016/12/16.
 */
public class MockDataShortUnboxingArray implements MockData<short[]> {
    public short[] mock(JmockDataContext context) {
        return JMockDataManager.getInstance().getMockTemplate().mockShortBaseArray (context);
    }
    public MockType mockType() {
        return MockType.NUMBER;
    }
}