package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class cam
  extends bhd
{
  public int rxG;
  public long rxH;
  public String seC;
  public long suO;
  public cas svJ;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.svJ == null) {
        throw new b("Not all required fields were included: ReportData");
      }
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      if (this.seC != null) {
        paramVarArgs.g(2, this.seC);
      }
      paramVarArgs.fT(3, this.rxG);
      paramVarArgs.T(4, this.rxH);
      if (this.svJ != null)
      {
        paramVarArgs.fV(5, this.svJ.boi());
        this.svJ.a(paramVarArgs);
      }
      paramVarArgs.T(6, this.suO);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label622;
      }
    }
    label622:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.seC != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.seC);
      }
      i = i + f.a.a.a.fQ(3, this.rxG) + f.a.a.a.S(4, this.rxH);
      paramInt = i;
      if (this.svJ != null) {
        paramInt = i + f.a.a.a.fS(5, this.svJ.boi());
      }
      return paramInt + f.a.a.a.S(6, this.suO);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhd.a(paramVarArgs); paramInt > 0; paramInt = bhd.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.svJ != null) {
          break;
        }
        throw new b("Not all required fields were included: ReportData");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        cam localcam = (cam)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new fk();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((fk)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localcam.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localcam.seC = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localcam.rxG = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          localcam.rxH = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 5: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new cas();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cas)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localcam.svJ = ((cas)localObject1);
            paramInt += 1;
          }
        }
        localcam.suO = ((f.a.a.a.a)localObject1).vHC.rZ();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/cam.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */