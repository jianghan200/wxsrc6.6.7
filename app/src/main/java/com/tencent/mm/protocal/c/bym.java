package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class bym
  extends bhd
{
  public String hbL;
  public int rdY;
  public int reb;
  public int rgC;
  public int rjC;
  public bhy rtW;
  public String sso;
  public int ssp;
  public int ssq;
  public int sut;
  public int suu;
  public LinkedList<bhz> suv = new LinkedList();
  public LinkedList<bhy> suw = new LinkedList();
  
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
      if (this.hbL != null) {
        paramVarArgs.g(2, this.hbL);
      }
      if (this.rtW != null)
      {
        paramVarArgs.fV(3, this.rtW.boi());
        this.rtW.a(paramVarArgs);
      }
      paramVarArgs.fT(4, this.rjC);
      if (this.sso != null) {
        paramVarArgs.g(5, this.sso);
      }
      paramVarArgs.fT(6, this.rgC);
      paramVarArgs.fT(7, this.ssp);
      paramVarArgs.fT(8, this.reb);
      paramVarArgs.fT(9, this.ssq);
      paramVarArgs.fT(10, this.rdY);
      paramVarArgs.fT(11, this.sut);
      paramVarArgs.fT(12, this.suu);
      paramVarArgs.d(13, 8, this.suv);
      paramVarArgs.d(14, 8, this.suw);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label1142;
      }
    }
    label1142:
    for (int i = f.a.a.a.fS(1, this.shX.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.hbL != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.hbL);
      }
      i = paramInt;
      if (this.rtW != null) {
        i = paramInt + f.a.a.a.fS(3, this.rtW.boi());
      }
      i += f.a.a.a.fQ(4, this.rjC);
      paramInt = i;
      if (this.sso != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.sso);
      }
      return paramInt + f.a.a.a.fQ(6, this.rgC) + f.a.a.a.fQ(7, this.ssp) + f.a.a.a.fQ(8, this.reb) + f.a.a.a.fQ(9, this.ssq) + f.a.a.a.fQ(10, this.rdY) + f.a.a.a.fQ(11, this.sut) + f.a.a.a.fQ(12, this.suu) + f.a.a.a.c(13, 8, this.suv) + f.a.a.a.c(14, 8, this.suw);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.suv.clear();
        this.suw.clear();
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
        bym localbym = (bym)paramVarArgs[1];
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
            localbym.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbym.hbL = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbym.rtW = ((bhy)localObject1);
            paramInt += 1;
          }
        case 4: 
          localbym.rjC = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localbym.sso = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localbym.rgC = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          localbym.ssp = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 8: 
          localbym.reb = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 9: 
          localbym.ssq = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 10: 
          localbym.rdY = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 11: 
          localbym.sut = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 12: 
          localbym.suu = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 13: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhz();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbym.suv.add(localObject1);
            paramInt += 1;
          }
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bhy();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
          localbym.suw.add(localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/bym.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */