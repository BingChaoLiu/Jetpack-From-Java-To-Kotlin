/*
 * Copyright 2018-2020 KunMinX
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.kunminx.jetpack_java.sample_03_viewmodel.data;

import androidx.lifecycle.MutableLiveData;

import com.kunminx.jetpack_java.common_data.APIs;
import com.kunminx.jetpack_java.common_data.bean.Moment;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Create by KunMinX at 2020/5/30
 */
public class DataRepository {

    private static DataRepository sRepository = new DataRepository();

    public static DataRepository getInstance() {
        return sRepository;
    }

    private DataRepository() {
    }

    public void requestList(MutableLiveData<List<Moment>> liveData) {
        List<Moment> list = new ArrayList<>();

        list.add(new Moment(getUUID(), "刚刚在掘金发表了最新一期动态，感兴趣的小伙伴可前往查阅",
                "重庆朝天门码头", APIs.SCENE_URL, "KunMinX", APIs.KUNMINX_URL));

        list.add(new Moment(getUUID(), "刚刚在掘金发表了最新一期动态，感兴趣的小伙伴可前往查阅",
                "重庆朝天门码头", APIs.SCENE_URL, "Flywith24", APIs.FLYWITH24_URL));

        list.add(new Moment(getUUID(), "刚刚在掘金发表了最新一期动态，感兴趣的小伙伴可前往查阅",
                "重庆朝天门码头", APIs.SCENE_URL, "KunMinX", APIs.KUNMINX_URL));

        list.add(new Moment(getUUID(), "刚刚在掘金发表了最新一期动态，感兴趣的小伙伴可前往查阅",
                "重庆朝天门码头", APIs.SCENE_URL, "Flywith24", APIs.FLYWITH24_URL));

        list.add(new Moment(getUUID(), "刚刚在掘金发表了最新一期动态，感兴趣的小伙伴可前往查阅",
                "重庆朝天门码头", APIs.SCENE_URL, "KunMinX", APIs.KUNMINX_URL));

        list.add(new Moment(getUUID(), "刚刚在掘金发表了最新一期动态，感兴趣的小伙伴可前往查阅",
                "重庆朝天门码头", APIs.SCENE_URL, "Flywith24", APIs.FLYWITH24_URL));

        list.add(new Moment(getUUID(), "刚刚在掘金发表了最新一期动态，感兴趣的小伙伴可前往查阅",
                "重庆朝天门码头", APIs.SCENE_URL, "KunMinX", APIs.KUNMINX_URL));

        list.add(new Moment(getUUID(), "刚刚在掘金发表了最新一期动态，感兴趣的小伙伴可前往查阅",
                "重庆朝天门码头", APIs.SCENE_URL, "Flywith24", APIs.FLYWITH24_URL));

        liveData.setValue(list);
    }

    private String getUUID() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}
