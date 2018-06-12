package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class bhi
  extends com.tencent.mm.bk.a
{
  public int qCh;
  public int rIr;
  public int rPB;
  public int rlY;
  public int sdX;
  public bhl sih;
  public bhk sii;
  public int sij;
  public String sik;
  public int sil;
  public int sim;
  public int sin;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.sik == null) {
        throw new b("Not all required fields were included: SampleId");
      }
      paramVarArgs.fT(1, this.sdX);
      if (this.sih != null)
      {
        paramVarArgs.fV(2, this.sih.boi());
        this.sih.a(paramVarArgs);
      }
      if (this.sii != null)
      {
        paramVarArgs.fV(3, this.sii.boi());
        this.sii.a(paramVarArgs);
      }
      paramVarArgs.fT(4, this.rIr);
      paramVarArgs.fT(5, this.sij);
      if (this.sik != null) {
        paramVarArgs.g(6, this.sik);
      }
      paramVarArgs.fT(7, this.rlY);
      paramVarArgs.fT(8, this.sil);
      paramVarArgs.fT(9, this.qCh);
      paramVarArgs.fT(10, this.sim);
      paramVarArgs.fT(11, this.sin);
      paramVarArgs.fT(12, this.rPB);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = f.a.a.a.fQ(1, this.sdX) + 0;
      paramInt = i;
      if (this.sih != null) {
        paramInt = i + f.a.a.a.fS(2, this.sih.boi());
      }
      i = paramInt;
      if (this.sii != null) {
        i = paramInt + f.a.a.a.fS(3, this.sii.boi());
      }
      i = i + f.a.a.a.fQ(4, this.rIr) + f.a.a.a.fQ(5, this.sij);
      paramInt = i;
      if (this.sik != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.sik);
      }
      return paramInt + f.a.a.a.fQ(7, this.rlY) + f.a.a.a.fQ(8, this.sil) + f.a.a.a.fQ(9, this.qCh) + f.a.a.a.fQ(10, this.sim) + f.a.a.a.fQ(11, this.sin) + f.a.a.a.fQ(12, this.rPB);
    }
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      if (this.sik == null) {
        throw new b("Not all required fields were included: SampleId");
      }
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
      bhi localbhi = (bhi)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        localbhi.sdX = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 2: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bhl();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bhl)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localbhi.sih = ((bhl)localObject1);
          paramInt += 1;
        }
        return 0;
      case 3: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bhk();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bhk)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localbhi.sii = ((bhk)localObject1);
          paramInt += 1;
        }
        return 0;
      case 4: 
        localbhi.rIr = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 5: 
        localbhi.sij = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 6: 
        localbhi.sik = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 7: 
        localbhi.rlY = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 8: 
        localbhi.sil = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 9: 
        localbhi.qCh = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 10: 
        localbhi.sim = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 11: 
        localbhi.sin = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      localbhi.rPB = ((f.a.a.a.a)localObject1).vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/bhi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */