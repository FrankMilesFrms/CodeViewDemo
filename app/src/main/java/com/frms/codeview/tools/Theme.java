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

import com.frms.lexer.TAG;

/**
 * 项目名称 ： APProject
 * @author  ： Frms,  3505826836@qq.com
 * 创建时间 ： 2020/2/8 16:26(ydt)
 */
public abstract class Theme
{
    public static int COMMON, CONSTANT, INTENGER, KEYWORD, STRING, SYMBOL, UNKOWN, ZHUSHI;
    
    public Theme()
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
    
    public abstract int getBackgroundColor();
    
    
    public abstract int getLineCountColor();
    
    public abstract int getNormalColor();
    
    public abstract int getSelectColor();
    
    /**
     * 返回颜色。
     * @param sign
     * @return
     */
    public int getColor(int sign)
    {
        switch (sign)
        {
            case TAG.CONSTANT :return CONSTANT;
            
            case TAG.INTENGER:return INTENGER;
            
            case TAG.KEYWORD:return KEYWORD;
            
            case 0x103:
            case TAG.STRING:
                return STRING;
            
            case TAG.SYMBOL:return SYMBOL;
            
            case TAG.ZHUSHI_BLOCK:
            case TAG.ZHUSHI_LINE :
                return ZHUSHI;
                
            case TAG.COMMON:return COMMON;
            
            case TAG.UNKNOW:
            default:
                return UNKOWN;
            
        }
    }
}
