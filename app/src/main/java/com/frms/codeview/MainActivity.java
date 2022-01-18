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

package com.frms.codeview;


import android.os.Bundle;
import android.view.WindowManager;
import androidx.appcompat.app.AppCompatActivity;

import com.frms.codeview.tools.Kit;

/**
 * Demo
 * 创建人 ： Frms
 * 创建人邮箱 ： 3505826836@qq.com
 * 创建时间 ：2020/2/22 11:17(ydt)
 */
public class MainActivity extends AppCompatActivity
{
    CodeView codeView;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        codeView = new CodeView(this);
        // 设置主题是否为黑色
        codeView.setTheme(true);
        // 设置编辑字体
        codeView.setTypeface(CodeView.DEJAVUSANSMONO);
        // 设置提示语法
        codeView.setShowAuto(CodeView.LANGUAGE_NATIVE_JAVASCRIPT);
        // 设置初始文字，只能调用一次，如果想多次调用见
        // {@link com.frms.codeview.CodeView#insert()}
        // {@link com.frms.codeview.CodeView#delete()}
        codeView.setText("", false);
        // 设置编辑模式
        codeView.setEditMode(false);
        // 设置断点监听
        codeView.setOnDebugListener(Kit::printout);
        // 防止遮挡文本
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE);
        // 可见：
        // codeView.redo();
        // codeView.undo();
        // codeView.setChangeEditMode();
        // codeView.getCharsRecord();
        // ......
        setContentView(codeView);
    }
    
    @Override
    public void onWindowFocusChanged(boolean hasFocus)
    {
        super.onWindowFocusChanged(hasFocus);
        if(hasFocus)
            codeView.showMagnifier();
    }

    
}
