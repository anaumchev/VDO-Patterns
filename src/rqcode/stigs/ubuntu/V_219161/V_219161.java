package rqcode.stigs.ubuntu.V_219161;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import rqcode.concepts.Checkable;
import rqcode.concepts.Checkable.CheckStatus;
import rqcode.stigs.ubuntu.UbuntuPackagePattern;

/**
 * Remote access services, such as those providing remote access to network devices and information systems, which lack automated control capabilities, increase risk and make remote user access management difficult at best. Remote access is access to DoD nonpublic information systems by an authorized user (or an information system) communicating through an external, non-organization-controlled network. Remote access methods include, for example, dial-up, broadband, and wireless. Ubuntu operating system functionality (e.g., RDP) must be capable of taking enforcement action if the audit reveals unauthorized activity. Automated control of remote access sessions allows organizations to ensure ongoing compliance with remote access policies by enforcing connection rules of remote access applications on a variety of information system components (e.g., servers, workstations, notebook computers, smartphones, and tablets).
 * 
 * https://www.stigviewer.com/stig/canonical_ubuntu_18.04_lts/2021-06-16/finding/V-219161
 */
@objid ("8eef4ba0-d537-4cdd-8b9f-c37339b29965")
public class V_219161 implements Checkable {
    @objid ("9d339b06-bf39-4cc5-a26b-bcd94d4af88a")
    private UbuntuPackagePattern _package = new UbuntuPackagePattern("ufw", true);

    @objid ("4983d91a-3c5b-4137-91cd-b329fade3f4c")
    public CheckStatus check() {
        return _package.check();
    }

    @objid ("4a41fe70-d790-4d7e-aa8c-89c3148f18c9")
    public String toString() {
        return _package.toString();
    }

}
