package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class ans
  extends bhp
{
  public String riK;
  public bej riQ;
  public String ruG;
  public String ruH;
  public int ruI;
  public xr ruJ;
  public hz ruK;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.six == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.riQ == null) {
        throw new b("Not all required fields were included: qy_base_resp");
      }
      if (this.six != null)
      {
        paramVarArgs.fV(1, this.six.boi());
        this.six.a(paramVarArgs);
      }
      if (this.riQ != null)
      {
        paramVarArgs.fV(2, this.riQ.boi());
        this.riQ.a(paramVarArgs);
      }
      if (this.riK != null) {
        paramVarArgs.g(3, this.riK);
      }
      paramVarArgs.fT(4, this.ruI);
      if (this.ruJ != null)
      {
        paramVarArgs.fV(5, this.ruJ.boi());
        this.ruJ.a(paramVarArgs);
      }
      if (this.ruK != null)
      {
        paramVarArgs.fV(6, this.ruK.boi());
        this.ruK.a(paramVarArgs);
      }
      if (this.ruG != null) {
        paramVarArgs.g(7, this.ruG);
      }
      if (this.ruH != null) {
        paramVarArgs.g(8, this.ruH);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label992;
      }
    }
    label992:
    for (int i = f.a.a.a.fS(1, this.six.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.riQ != null) {
        paramInt = i + f.a.a.a.fS(2, this.riQ.boi());
      }
      i = paramInt;
      if (this.riK != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.riK);
      }
      i += f.a.a.a.fQ(4, this.ruI);
      paramInt = i;
      if (this.ruJ != null) {
        paramInt = i + f.a.a.a.fS(5, this.ruJ.boi());
      }
      i = paramInt;
      if (this.ruK != null) {
        i = paramInt + f.a.a.a.fS(6, this.ruK.boi());
      }
      paramInt = i;
      if (this.ruG != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.ruG);
      }
      i = paramInt;
      if (this.ruH != null) {
        i = paramInt + f.a.a.b.b.a.h(8, this.ruH);
      }
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhp.a(paramVarArgs); paramInt > 0; paramInt = bhp.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.six == null) {
          throw new b("Not all required fields were included: BaseResponse");
        }
        if (this.riQ != null) {
          break;
        }
        throw new b("Not all required fields were included: qy_base_resp");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        ans localans = (ans)paramVarArgs[1];
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
            localans.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bej();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bej)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localans.riQ = ((bej)localObject1);
            paramInt += 1;
          }
        case 3: 
          localans.riK = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localans.ruI = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new xr();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((xr)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localans.ruJ = ((xr)localObject1);
            paramInt += 1;
          }
        case 6: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new hz();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((hz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localans.ruK = ((hz)localObject1);
            paramInt += 1;
          }
        case 7: 
          localans.ruG = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localans.ruH = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/ans.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */