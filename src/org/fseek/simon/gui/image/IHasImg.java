/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.fseek.simon.gui.image;

import java.awt.image.BufferedImage;

/**
 *
 * @author Simon
 */
public interface IHasImg {
    public void setImage(BufferedImage img);
    public BufferedImage getImage();
}
