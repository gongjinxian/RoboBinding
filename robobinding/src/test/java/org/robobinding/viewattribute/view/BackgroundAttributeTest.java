/**
 * Copyright 2011 Cheng Wei, Robert Taylor
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions
 * and limitations under the License.
 */
package org.robobinding.viewattribute.view;

import org.robobinding.viewattribute.AbstractMultiTypePropertyViewAttributeTest;
import org.robobinding.viewattribute.view.BackgroundAttribute.BitmapBackgroundAttribute;
import org.robobinding.viewattribute.view.BackgroundAttribute.DrawableBackgroundAttribute;
import org.robobinding.viewattribute.view.BackgroundAttribute.ResourceIdBackgroundAttribute;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/**
 * 
 * @since 1.0
 * @version $Revision: 1.0 $
 * @author Cheng Wei
 */
public class BackgroundAttributeTest extends AbstractMultiTypePropertyViewAttributeTest<BackgroundAttribute>
{
	@Override
	protected void populateTypeMappingExpectations(TypeMappingExpectations mappingExpectations)
	{
		mappingExpectations.add(int.class, ResourceIdBackgroundAttribute.class);
		mappingExpectations.add(Integer.class, ResourceIdBackgroundAttribute.class);
		mappingExpectations.add(Bitmap.class, BitmapBackgroundAttribute.class);
		mappingExpectations.add(Drawable.class, DrawableBackgroundAttribute.class);
	}
}