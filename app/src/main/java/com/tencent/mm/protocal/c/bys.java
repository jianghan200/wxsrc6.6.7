package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class bys
  extends bhd
{
  public int rgC;
  public int rjC;
  public int rko;
  public bhy rtW;
  public bhz shU;
  public String sso;
  public int ssq;
  public int suC;
  public LinkedList<bhz> suD = new LinkedList();
  public int suE;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rtW == null) {
        throw new b("Not all required fields were included: Data");
      }
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      if (this.rtW != null)
      {
        paramVarArgs.fV(2, this.rtW.boi());
        this.rtW.a(paramVarArgs);
      }
      paramVarArgs.fT(3, this.rjC);
      if (this.sso != null) {
        paramVarArgs.g(4, this.sso);
      }
      paramVarArgs.fT(5, this.rgC);
      paramVarArgs.fT(6, this.ssq);
      paramVarArgs.fT(7, this.rko);
      paramVarArgs.fT(8, this.suC);
      paramVarArgs.d(9, 8, this.suD);
      if (this.shU != null)
      {
        paramVarArgs.fV(10, this.shU.boi());
        this.shU.a(paramVarArgs);
      }
      paramVarArgs.fT(11, this.suE);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label1025;
      }
    }
    label1025:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.rtW != null) {
        i = paramInt + f.a.a.a.fS(2, this.rtW.boi());
      }
      i += f.a.a.a.fQ(3, this.rjC);
      paramInt = i;
      if (this.sso != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.sso);
      }
      i = paramInt + f.a.a.a.fQ(5, this.rgC) + f.a.a.a.fQ(6, this.ssq) + f.a.a.a.fQ(7, this.rko) + f.a.a.a.fQ(8, this.suC) + f.a.a.a.c(9, 8, this.suD);
      paramInt = i;
      if (this.shU != null) {
        paramInt = i + f.a.a.a.fS(10, this.shU.boi());
      }
      return paramInt + f.a.a.a.fQ(11, this.suE);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.suD.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = bhd.a(paramVarArgs); paramInt > 0; paramInt = bhd.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.rtW != null) {
          break;
        }
        throw new b("Not all required fields were included: Data");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        bys localbys = (bys)paramVarArgs[1];
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
            localbys.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbys.rtW = ((bhy)localObject1);
            paramInt += 1;
          }
        case 3: 
          localbys.rjC = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          localbys.sso = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localbys.rgC = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          localbys.ssq = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          localbys.rko = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 8: 
          localbys.suC = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 9: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhz();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbys.suD.add(localObject1);
            paramInt += 1;
          }
        case 10: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhz();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbys.shU = ((bhz)localObject1);
            paramInt += 1;
          }
        }
        localbys.suE = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/bys.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */