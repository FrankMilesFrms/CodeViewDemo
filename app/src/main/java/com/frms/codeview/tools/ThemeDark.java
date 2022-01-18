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

/**
 * 创建人 ： Frms
 * 创建人邮箱 ： 3505826836@qq.com
 * 创建时间 ：2020/2/22 11:51(ydt)
 */
public class ThemeDark extends Theme
{
    
    public ThemeDark()
    {
        COMMON = 0xff323232;
        ZHUSHI = 0xff808080;
        STRING = 0xff6A8759;
        SYMBOL = 0xffffffff;
        INTENGER = 0xff6897BB;
        KEYWORD = 0xffcc7832;
        CONSTANT = 0xff9876aa;
        UNKOWN = 0xffFFEC8B;
    }  
    
    @Override
    public int getBackgroundColor()
    {
        return 0xff323232;
    }
    
    @Override
    public int getLineCountColor()
    {
        return 0x55ffffff;
    }
    
    @Override
    public int getNormalColor()
    {
        return 0xffFFEC8B;
    }
    
    @Override
    public int getSelectColor()
    {
        return 0x550099CC;
    }
    
}
