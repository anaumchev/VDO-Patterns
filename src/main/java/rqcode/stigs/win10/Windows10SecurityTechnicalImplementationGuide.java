package rqcode.stigs.win10;

import rqcode.concepts.CheckableEnforceableRequirement;

public class Windows10SecurityTechnicalImplementationGuide {
    public static final CheckableEnforceableRequirement v_63447 = new V_63447();
    public static final CheckableEnforceableRequirement v_63449 = new V_63449();
    public static final CheckableEnforceableRequirement v_63463 = new V_63463();
    public static final CheckableEnforceableRequirement v_63467 = new V_63467();
    public static CheckableEnforceableRequirement[] allSTIGs() {
        CheckableEnforceableRequirement[] retArr = {
            v_63447,
            v_63449,
            v_63463,
            v_63467
        };
        return retArr;
    }
}
