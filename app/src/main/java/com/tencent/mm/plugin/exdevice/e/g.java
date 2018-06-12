package com.tencent.mm.plugin.exdevice.e;

import f.a.a.b;
import java.util.LinkedList;

public final class g
  extends j
{
  public String hbQ;
  public int iwW;
  public int iwX;
  public int iwY;
  public int iwZ;
  public int ixa;
  public String ixb;
  public int ixc;
  public String ixd;
  public int ixe;
  public int ixf;
  public String ixg;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.ixj == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.ixj != null)
      {
        paramVarArgs.fV(1, this.ixj.boi());
        this.ixj.a(paramVarArgs);
      }
      paramVarArgs.fT(2, this.iwW);
      paramVarArgs.fT(3, this.iwX);
      paramVarArgs.fT(4, this.iwY);
      paramVarArgs.fT(5, this.iwZ);
      paramVarArgs.fT(6, this.ixa);
      if (this.ixb != null) {
        paramVarArgs.g(11, this.ixb);
      }
      paramVarArgs.fT(12, this.ixc);
      if (this.hbQ != null) {
        paramVarArgs.g(13, this.hbQ);
      }
      if (this.ixd != null) {
        paramVarArgs.g(14, this.ixd);
      }
      paramVarArgs.fT(15, this.ixe);
      paramVarArgs.fT(16, this.ixf);
      if (this.ixg != null) {
        paramVarArgs.g(17, this.ixg);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.ixj == null) {
        break label861;
      }
    }
    label861:
    for (paramInt = f.a.a.a.fS(1, this.ixj.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.iwW) + f.a.a.a.fQ(3, this.iwX) + f.a.a.a.fQ(4, this.iwY) + f.a.a.a.fQ(5, this.iwZ) + f.a.a.a.fQ(6, this.ixa);
      paramInt = i;
      if (this.ixb != null) {
        paramInt = i + f.a.a.b.b.a.h(11, this.ixb);
      }
      i = paramInt + f.a.a.a.fQ(12, this.ixc);
      paramInt = i;
      if (this.hbQ != null) {
        paramInt = i + f.a.a.b.b.a.h(13, this.hbQ);
      }
      i = paramInt;
      if (this.ixd != null) {
        i = paramInt + f.a.a.b.b.a.h(14, this.ixd);
      }
      i = i + f.a.a.a.fQ(15, this.ixe) + f.a.a.a.fQ(16, this.ixf);
      paramInt = i;
      if (this.ixg != null) {
        paramInt = i + f.a.a.b.b.a.h(17, this.ixg);
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = j.a(paramVarArgs); paramInt > 0; paramInt = j.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.ixj != null) {
          break;
        }
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        g localg = (g)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        case 7: 
        case 8: 
        case 9: 
        case 10: 
        default: 
          return -1;
        case 1: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            Object localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new e();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((e)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, j.a((f.a.a.a.a)localObject2))) {}
            localg.ixj = ((e)localObject1);
            paramInt += 1;
          }
        case 2: 
          localg.iwW = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localg.iwX = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          localg.iwY = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localg.iwZ = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          localg.ixa = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 11: 
          localg.ixb = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 12: 
          localg.ixc = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 13: 
          localg.hbQ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 14: 
          localg.ixd = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 15: 
          localg.ixe = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 16: 
          localg.ixf = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localg.ixg = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/exdevice/e/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */