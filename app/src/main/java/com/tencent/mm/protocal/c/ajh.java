package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class ajh
  extends bhp
{
  public String dxc;
  public boolean ixT;
  public LinkedList<String> rLU = new LinkedList();
  public String rLV;
  public String rLW;
  public boolean rLY;
  public LinkedList<cie> rMb = new LinkedList();
  public LinkedList<cif> rMc = new LinkedList();
  public String rMd;
  public String rMe;
  public String rMf;
  public String rMg;
  public boolean rMh;
  public int rMi;
  public String rMj;
  public LinkedList<xj> rch = new LinkedList();
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.six == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.rMd == null) {
        throw new b("Not all required fields were included: championcoverurl");
      }
      if (this.rMe == null) {
        throw new b("Not all required fields were included: championmotto");
      }
      if (this.dxc == null) {
        throw new b("Not all required fields were included: rankid");
      }
      if (this.six != null)
      {
        paramVarArgs.fV(1, this.six.boi());
        this.six.a(paramVarArgs);
      }
      paramVarArgs.d(2, 8, this.rMb);
      paramVarArgs.d(3, 8, this.rMc);
      paramVarArgs.d(4, 1, this.rLU);
      if (this.rMd != null) {
        paramVarArgs.g(5, this.rMd);
      }
      if (this.rMe != null) {
        paramVarArgs.g(6, this.rMe);
      }
      if (this.dxc != null) {
        paramVarArgs.g(7, this.dxc);
      }
      if (this.rMf != null) {
        paramVarArgs.g(8, this.rMf);
      }
      if (this.rLV != null) {
        paramVarArgs.g(9, this.rLV);
      }
      paramVarArgs.av(10, this.ixT);
      if (this.rLW != null) {
        paramVarArgs.g(11, this.rLW);
      }
      paramVarArgs.d(12, 8, this.rch);
      paramVarArgs.av(13, this.rLY);
      if (this.rMg != null) {
        paramVarArgs.g(14, this.rMg);
      }
      paramVarArgs.av(15, this.rMh);
      paramVarArgs.fT(16, this.rMi);
      if (this.rMj != null) {
        paramVarArgs.g(17, this.rMj);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label1454;
      }
    }
    label1454:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.c(2, 8, this.rMb) + f.a.a.a.c(3, 8, this.rMc) + f.a.a.a.c(4, 1, this.rLU);
      paramInt = i;
      if (this.rMd != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.rMd);
      }
      i = paramInt;
      if (this.rMe != null) {
        i = paramInt + f.a.a.b.b.a.h(6, this.rMe);
      }
      paramInt = i;
      if (this.dxc != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.dxc);
      }
      i = paramInt;
      if (this.rMf != null) {
        i = paramInt + f.a.a.b.b.a.h(8, this.rMf);
      }
      paramInt = i;
      if (this.rLV != null) {
        paramInt = i + f.a.a.b.b.a.h(9, this.rLV);
      }
      i = paramInt + (f.a.a.b.b.a.ec(10) + 1);
      paramInt = i;
      if (this.rLW != null) {
        paramInt = i + f.a.a.b.b.a.h(11, this.rLW);
      }
      i = paramInt + f.a.a.a.c(12, 8, this.rch) + (f.a.a.b.b.a.ec(13) + 1);
      paramInt = i;
      if (this.rMg != null) {
        paramInt = i + f.a.a.b.b.a.h(14, this.rMg);
      }
      i = paramInt + (f.a.a.b.b.a.ec(15) + 1) + f.a.a.a.fQ(16, this.rMi);
      paramInt = i;
      if (this.rMj != null) {
        paramInt = i + f.a.a.b.b.a.h(17, this.rMj);
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rMb.clear();
        this.rMc.clear();
        this.rLU.clear();
        this.rch.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = bhp.a(paramVarArgs); paramInt > 0; paramInt = bhp.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.six == null) {
          throw new b("Not all required fields were included: BaseResponse");
        }
        if (this.rMd == null) {
          throw new b("Not all required fields were included: championcoverurl");
        }
        if (this.rMe == null) {
          throw new b("Not all required fields were included: championmotto");
        }
        if (this.dxc != null) {
          break;
        }
        throw new b("Not all required fields were included: rankid");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        ajh localajh = (ajh)paramVarArgs[1];
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
            localajh.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new cie();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cie)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localajh.rMb.add(localObject1);
            paramInt += 1;
          }
        case 3: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new cif();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cif)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localajh.rMc.add(localObject1);
            paramInt += 1;
          }
        case 4: 
          localajh.rLU.add(((f.a.a.a.a)localObject1).vHC.readString());
          return 0;
        case 5: 
          localajh.rMd = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localajh.rMe = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          localajh.dxc = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 8: 
          localajh.rMf = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 9: 
          localajh.rLV = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 10: 
          localajh.ixT = ((f.a.a.a.a)localObject1).cJQ();
          return 0;
        case 11: 
          localajh.rLW = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 12: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new xj();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((xj)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localajh.rch.add(localObject1);
            paramInt += 1;
          }
        case 13: 
          localajh.rLY = ((f.a.a.a.a)localObject1).cJQ();
          return 0;
        case 14: 
          localajh.rMg = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 15: 
          localajh.rMh = ((f.a.a.a.a)localObject1).cJQ();
          return 0;
        case 16: 
          localajh.rMi = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localajh.rMj = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/ajh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */