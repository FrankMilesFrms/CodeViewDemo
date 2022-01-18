/*
 * Copyright Frms
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.frms.codeview.tools;

import android.graphics.Color;

/**
 * 创建人 ： Frms
 * 创建人邮箱 ： 3505826836@qq.com
 * 创建时间 ：2020/2/22 11:50 = ydt)
 */
public class ThemeLight extends Theme
{
    public ThemeLight()
    {
        COMMON = 0xff444444;
        ZHUSHI = 0xff808080;
        STRING = 0xff008000;
        SYMBOL = 0xff3d3d3d;
        INTENGER = 0xff0000ff;
        KEYWORD = 0xff000080;
        CONSTANT = 0xff660e7a;
        UNKOWN = Color.BLACK;
    }
    @Override
    public int getBackgroundColor ()
    {
        return Color.WHITE;
    }
    
    @Override
    public int getLineCountColor()
    {
        return Color.BLACK;
    }
    
    @Override
    public int getNormalColor()
    {
        return Color.BLACK;
    }
    
    @Override
    public int getSelectColor()
    {
        return 0x550099CC;
    }
    
}
