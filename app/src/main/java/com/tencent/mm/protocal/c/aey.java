package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class aey
  extends bhp
{
  public String cad;
  public String dxh;
  public int end_time;
  public String huU;
  public String huW;
  public String huX;
  public String huY;
  public String hwh;
  public int mXn;
  public String mXo;
  public String mXp;
  public String mXq;
  public String mXs;
  public boolean mXt;
  public boolean rIO;
  public boolean rIP;
  public String rIQ;
  public String rIR;
  public int rIS;
  public String rIT;
  public int rIU;
  public String rIV;
  public String title;
  
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
      paramVarArgs.av(2, this.rIO);
      paramVarArgs.av(3, this.rIP);
      if (this.rIQ != null) {
        paramVarArgs.g(4, this.rIQ);
      }
      if (this.rIR != null) {
        paramVarArgs.g(5, this.rIR);
      }
      paramVarArgs.fT(6, this.rIS);
      if (this.rIT != null) {
        paramVarArgs.g(7, this.rIT);
      }
      paramVarArgs.fT(8, this.rIU);
      if (this.huU != null) {
        paramVarArgs.g(9, this.huU);
      }
      if (this.cad != null) {
        paramVarArgs.g(10, this.cad);
      }
      if (this.title != null) {
        paramVarArgs.g(11, this.title);
      }
      if (this.huX != null) {
        paramVarArgs.g(12, this.huX);
      }
      if (this.huY != null) {
        paramVarArgs.g(13, this.huY);
      }
      if (this.hwh != null) {
        paramVarArgs.g(14, this.hwh);
      }
      if (this.huW != null) {
        paramVarArgs.g(15, this.huW);
      }
      if (this.dxh != null) {
        paramVarArgs.g(16, this.dxh);
      }
      paramVarArgs.fT(17, this.mXn);
      if (this.mXo != null) {
        paramVarArgs.g(18, this.mXo);
      }
      if (this.mXp != null) {
        paramVarArgs.g(19, this.mXp);
      }
      if (this.mXq != null) {
        paramVarArgs.g(20, this.mXq);
      }
      paramVarArgs.fT(21, this.end_time);
      if (this.mXs != null) {
        paramVarArgs.g(22, this.mXs);
      }
      if (this.rIV != null) {
        paramVarArgs.g(23, this.rIV);
      }
      paramVarArgs.av(24, this.mXt);
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label1477;
      }
    }
    label1477:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + (f.a.a.b.b.a.ec(2) + 1) + (f.a.a.b.b.a.ec(3) + 1);
      paramInt = i;
      if (this.rIQ != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rIQ);
      }
      i = paramInt;
      if (this.rIR != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.rIR);
      }
      i += f.a.a.a.fQ(6, this.rIS);
      paramInt = i;
      if (this.rIT != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.rIT);
      }
      i = paramInt + f.a.a.a.fQ(8, this.rIU);
      paramInt = i;
      if (this.huU != null) {
        paramInt = i + f.a.a.b.b.a.h(9, this.huU);
      }
      i = paramInt;
      if (this.cad != null) {
        i = paramInt + f.a.a.b.b.a.h(10, this.cad);
      }
      paramInt = i;
      if (this.title != null) {
        paramInt = i + f.a.a.b.b.a.h(11, this.title);
      }
      i = paramInt;
      if (this.huX != null) {
        i = paramInt + f.a.a.b.b.a.h(12, this.huX);
      }
      paramInt = i;
      if (this.huY != null) {
        paramInt = i + f.a.a.b.b.a.h(13, this.huY);
      }
      i = paramInt;
      if (this.hwh != null) {
        i = paramInt + f.a.a.b.b.a.h(14, this.hwh);
      }
      paramInt = i;
      if (this.huW != null) {
        paramInt = i + f.a.a.b.b.a.h(15, this.huW);
      }
      i = paramInt;
      if (this.dxh != null) {
        i = paramInt + f.a.a.b.b.a.h(16, this.dxh);
      }
      i += f.a.a.a.fQ(17, this.mXn);
      paramInt = i;
      if (this.mXo != null) {
        paramInt = i + f.a.a.b.b.a.h(18, this.mXo);
      }
      i = paramInt;
      if (this.mXp != null) {
        i = paramInt + f.a.a.b.b.a.h(19, this.mXp);
      }
      paramInt = i;
      if (this.mXq != null) {
        paramInt = i + f.a.a.b.b.a.h(20, this.mXq);
      }
      i = paramInt + f.a.a.a.fQ(21, this.end_time);
      paramInt = i;
      if (this.mXs != null) {
        paramInt = i + f.a.a.b.b.a.h(22, this.mXs);
      }
      i = paramInt;
      if (this.rIV != null) {
        i = paramInt + f.a.a.b.b.a.h(23, this.rIV);
      }
      return i + (f.a.a.b.b.a.ec(24) + 1);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
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
        aey localaey = (aey)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
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
            Object localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new fl();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((fl)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localaey.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localaey.rIO = ((f.a.a.a.a)localObject1).cJQ();
          return 0;
        case 3: 
          localaey.rIP = ((f.a.a.a.a)localObject1).cJQ();
          return 0;
        case 4: 
          localaey.rIQ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localaey.rIR = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localaey.rIS = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          localaey.rIT = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 8: 
          localaey.rIU = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 9: 
          localaey.huU = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 10: 
          localaey.cad = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 11: 
          localaey.title = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 12: 
          localaey.huX = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 13: 
          localaey.huY = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 14: 
          localaey.hwh = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 15: 
          localaey.huW = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 16: 
          localaey.dxh = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 17: 
          localaey.mXn = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 18: 
          localaey.mXo = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 19: 
          localaey.mXp = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 20: 
          localaey.mXq = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 21: 
          localaey.end_time = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 22: 
          localaey.mXs = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 23: 
          localaey.rIV = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localaey.mXt = ((f.a.a.a.a)localObject1).cJQ();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/aey.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */