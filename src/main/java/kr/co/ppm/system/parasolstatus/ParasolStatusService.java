package kr.co.ppm.system.parasolstatus;

import kr.co.ppm.system.parasol.Parasol;

import java.util.List;

public interface ParasolStatusService {
    List<ParasolStatus> parasolStatusList(Parasol parasol);
    ParasolStatus viewParasolStatus(Parasol parasol);
    String receiveParasolStatus(ParasolStatus parasolStatus);
}
