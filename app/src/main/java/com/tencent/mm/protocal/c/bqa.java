package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class bqa
  extends bhp
{
  public int rXE;
  public LinkedList<boy> rgH = new LinkedList();
  public bhy slZ;
  public bpp smA;
  public String smu;
  public int smy;
  public int smz;
  public int snV;
  public int snW;
  public LinkedList<cg> snX = new LinkedList();
  public int snY;
  public LinkedList<bfl> snZ = new LinkedList();
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.six == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.six != null)
      {
        paramVarArgs.fV(1, this.six.boi());
        this.six.a(paramVarArgs);
      }
      if (this.smu != null) {
        paramVarArgs.g(2, this.smu);
      }
      paramVarArgs.fT(3, this.rXE);
      paramVarArgs.d(4, 8, this.rgH);
      paramVarArgs.fT(5, this.snV);
      paramVarArgs.fT(6, this.smy);
      paramVarArgs.fT(7, this.smz);
      if (this.smA != null)
      {
        paramVarArgs.fV(8, this.smA.boi());
        this.smA.a(paramVarArgs);
      }
      paramVarArgs.fT(9, this.snW);
      paramVarArgs.d(10, 8, this.snX);
      if (this.slZ != null)
      {
        paramVarArgs.fV(11, this.slZ.boi());
        this.slZ.a(paramVarArgs);
      }
      paramVarArgs.fT(12, this.snY);
      paramVarArgs.d(13, 8, this.snZ);
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label1287;
      }
    }
    label1287:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.smu != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.smu);
      }
      i = i + f.a.a.a.fQ(3, this.rXE) + f.a.a.a.c(4, 8, this.rgH) + f.a.a.a.fQ(5, this.snV) + f.a.a.a.fQ(6, this.smy) + f.a.a.a.fQ(7, this.smz);
      paramInt = i;
      if (this.smA != null) {
        paramInt = i + f.a.a.a.fS(8, this.smA.boi());
      }
      i = paramInt + f.a.a.a.fQ(9, this.snW) + f.a.a.a.c(10, 8, this.snX);
      paramInt = i;
      if (this.slZ != null) {
        paramInt = i + f.a.a.a.fS(11, this.slZ.boi());
      }
      return paramInt + f.a.a.a.fQ(12, this.snY) + f.a.a.a.c(13, 8, this.snZ);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rgH.clear();
        this.snX.clear();
        this.snZ.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = bhp.a(paramVarArgs); paramInt > 0; paramInt = bhp.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.six != null) {
          break;
        }
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        bqa localbqa = (bqa)paramVarArgs[1];
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
            localbqa.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbqa.smu = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localbqa.rXE = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new boy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((boy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbqa.rgH.add(localObject1);
            paramInt += 1;
          }
        case 5: 
          localbqa.snV = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          localbqa.smy = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          localbqa.smz = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 8: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bpp();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bpp)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbqa.smA = ((bpp)localObject1);
            paramInt += 1;
          }
        case 9: 
          localbqa.snW = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 10: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new cg();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cg)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbqa.snX.add(localObject1);
            paramInt += 1;
          }
        case 11: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbqa.slZ = ((bhy)localObject1);
            paramInt += 1;
          }
        case 12: 
          localbqa.snY = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bfl();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bfl)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
          localbqa.snZ.add(localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bqa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */