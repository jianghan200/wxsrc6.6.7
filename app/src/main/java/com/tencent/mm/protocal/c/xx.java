package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class xx
  extends bhp
{
  public String bHD;
  public LinkedList<String> rDJ = new LinkedList();
  public String rDK;
  public LinkedList<String> rDL = new LinkedList();
  public LinkedList<String> rDM = new LinkedList();
  public LinkedList<xy> rDN = new LinkedList();
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.six == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.bHD == null) {
        throw new b("Not all required fields were included: Title");
      }
      if (this.rDK == null) {
        throw new b("Not all required fields were included: JsonData");
      }
      if (this.six != null)
      {
        paramVarArgs.fV(1, this.six.boi());
        this.six.a(paramVarArgs);
      }
      if (this.bHD != null) {
        paramVarArgs.g(2, this.bHD);
      }
      paramVarArgs.d(3, 1, this.rDJ);
      if (this.rDK != null) {
        paramVarArgs.g(4, this.rDK);
      }
      paramVarArgs.d(5, 1, this.rDL);
      paramVarArgs.d(6, 1, this.rDM);
      paramVarArgs.d(7, 8, this.rDN);
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label773;
      }
    }
    label773:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.bHD != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.bHD);
      }
      i += f.a.a.a.c(3, 1, this.rDJ);
      paramInt = i;
      if (this.rDK != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rDK);
      }
      return paramInt + f.a.a.a.c(5, 1, this.rDL) + f.a.a.a.c(6, 1, this.rDM) + f.a.a.a.c(7, 8, this.rDN);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rDJ.clear();
        this.rDL.clear();
        this.rDM.clear();
        this.rDN.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = bhp.a(paramVarArgs); paramInt > 0; paramInt = bhp.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.six == null) {
          throw new b("Not all required fields were included: BaseResponse");
        }
        if (this.bHD == null) {
          throw new b("Not all required fields were included: Title");
        }
        if (this.rDK != null) {
          break;
        }
        throw new b("Not all required fields were included: JsonData");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        xx localxx = (xx)paramVarArgs[1];
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
            localObject1 = new fl();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((fl)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localxx.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localxx.bHD = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localxx.rDJ.add(((f.a.a.a.a)localObject1).vHC.readString());
          return 0;
        case 4: 
          localxx.rDK = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localxx.rDL.add(((f.a.a.a.a)localObject1).vHC.readString());
          return 0;
        case 6: 
          localxx.rDM.add(((f.a.a.a.a)localObject1).vHC.readString());
          return 0;
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new xy();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((xy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
          localxx.rDN.add(localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/xx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */