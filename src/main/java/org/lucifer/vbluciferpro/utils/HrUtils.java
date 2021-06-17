package org.lucifer.vbluciferpro.utils;

import org.lucifer.vbluciferpro.model.Hr;
import org.springframework.security.core.context.SecurityContextHolder;

import java.security.Security;

/**
 * @author lucifer
 */
public class HrUtils {

    public static Hr getCurrentHr (){
        return ((Hr) SecurityContextHolder.getContext().getAuthentication().getPrincipal());
    }
}
